SUMMARY = "Variscite GUI image based on core-image"
DESCRIPTION = "Image based on core-image with Variscite lab additions."
LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES = " \
    debug-tweaks \
    hwcodecs \
    nfs-client \
    ssh-server-openssh \
    tools-debug \
    tools-testapps \
"

# labgrid test framework
CORE_IMAGE_EXTRA_INSTALL += " \
    python3-labgrid \
    python3-usbsdmux \
    python3-kasa \
"

# Software Update Services
CORE_IMAGE_EXTRA_INSTALL += " \
    swupdate \
    swupdate-www \
"

# Remote Network Services
CORE_IMAGE_EXTRA_INSTALL += " \
    tmate \
    tailscale \
"

# Gneric packages
CORE_IMAGE_EXTRA_INSTALL += " \
    inetutils-tftp \
    inetutils-tftpd \
    nfs-utils \
    nfs-config \
    packagegroup-tools-bluetooth \
    packagegroup-variscite-devel \
"

WKS_FILE:mx8-nxp-bsp = "var-imx-swu-dual-rootfs.wks.in"

# Ensure /data exists and is mounted automatically from the data
# partition created in var-imx-swu-dual-rootfs.wks.in.
ROOTFS_POSTPROCESS_COMMAND:append = " var_labgrid_add_data_fstab;"

var_labgrid_add_data_fstab() {
    install -d ${IMAGE_ROOTFS}/data

    # Add this mount line to /etc/fstab:
    #   LABEL=data /data ext4 defaults 0 2
    #
    # - LABEL=data: mount the partition labeled "data".
    # - /data ext4: mount as ext4 at /data.
    # - defaults: standard read-write mount behavior.
    # - 0: disable the legacy dump backup utility for this filesystem.
    # - 2: allow fsck to check this non-root filesystem after the rootfs.
    printf "%-20s %-20s %-10s %-21s %-2s %s\n" \
            "LABEL=data" "/data" "ext4" "defaults" "0" "2" \
            >> ${IMAGE_ROOTFS}${sysconfdir}/fstab
}

COMPATIBLE_MACHINE = "(imx8mm-var-dart)"
