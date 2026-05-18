SUMMARY = "python-kasa is a Python library to control TPLink's smart home devices (plugs, wall switches, power strips, and bulbs)."
HOMEPAGE = "https://pypi.org/project/python-kasa/"

LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2985c82f73ff609676c9768564d19673"

SRC_URI[sha256sum] = "4a75b72dc354b43b0b038d5f8ca142049879c76415728a9f24473fb15af45562"

PYPI_PACKAGE = "python_kasa"

DEPENDS += "python3-hatch-vcs-native"

inherit pypi python_hatchling

RDEPENDS:${PN} += " \
    python3-aiohttp \
    python3-asyncclick \
    python3-cryptography \
    python3-mashumaro \
"

BBCLASSEXTEND = "native nativesdk"
