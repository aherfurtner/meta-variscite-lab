FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://0001-imx8mm-var-dart-Use-user-UARTs-as-GPIOs.patch \
"

# Enable support for Linux Automation USB-SD-Mux
do_configure:prepend() {
    echo "CONFIG_CHR_DEV_SG=y" >> ${B}/.config
}
