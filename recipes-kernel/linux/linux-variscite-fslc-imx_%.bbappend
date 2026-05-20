FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://0001-imx8mm-var-dart-Use-user-UARTs-as-GPIOs.patch \
    file://enable-nfs.cfg \
    file://enable-gpio-sysfs.cfg \
"

# Apply some kernel configuration requirements
do_configure:prepend() {
    # Add SCSI support to enable the usage of Linux Automation
    # USB-SD-MUX.
    echo "CONFIG_CHR_DEV_SG=y" >> ${B}/.config
}
