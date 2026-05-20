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

# Network Services
CORE_IMAGE_EXTRA_INSTALL += " \
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
    tmate \
"

WKS_FILE:mx8-nxp-bsp = "var-imx-swu-dual-rootfs.wks.in"

COMPATIBLE_MACHINE = "(imx8mm-var-dart)"
