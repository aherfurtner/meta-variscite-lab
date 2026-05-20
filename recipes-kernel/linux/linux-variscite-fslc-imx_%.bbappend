FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://enable-nfs.cfg \
    file://enable-scsi.cfg \
    file://enable-gpio-sysfs.cfg \
"

SRC_URI:append:imx8mm-var-dart = " \
    file://0001-use-user-uarts-as-gpios.patch \
"
