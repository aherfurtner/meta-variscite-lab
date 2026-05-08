SUMMARY = "Variscite GUI image based on fsl-image-gui"
DESCRIPTION = "Image based on fsl-image-gui with Variscite lab additions."
LICENSE = "MIT"

require recipes-fsl/images/fsl-image-gui.bb

# labgrid test framework
CORE_IMAGE_EXTRA_INSTALL += " \
    python3-labgrid \
    python3-usbsdmux \
"

# Network Services
CORE_IMAGE_EXTRA_INSTALL += " \
    tailscale \
"

# Software Update Services
CORE_IMAGE_EXTRA_INSTALL += " \
    swupdate \
"

COMPATIBLE_MACHINE = "(imx8mm-var-dart)"
