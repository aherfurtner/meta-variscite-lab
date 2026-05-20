FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://0001-imx8mm-var-dart-Use-user-UARTs-as-GPIOs.patch \
    file://enable-nfs.cfg \
"

# Apply some kernel configuration requirements
do_configure:prepend() {
    # (Re-)enable GPIO sysfs support to enable the usage
    # of digital output driver with labgrid as libgpiod
    # is currently not supported.
    #
    # See: https://github.com/labgrid-project/labgrid/issues/1715
    echo "CONFIG_GPIO_SYSFS=y" >> ${B}/.config

    # Add SCSI support to enable the usage of Linux Automation
    # USB-SD-MUX.
    echo "CONFIG_CHR_DEV_SG=y" >> ${B}/.config
}
