FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://0001-imx8mm-var-dart-Use-user-UARTs-as-GPIOs.patch \
    file://enable-nfs.cfg \
    file://enable-scsi.cfg \
    file://enable-gpio-sysfs.cfg \
"
