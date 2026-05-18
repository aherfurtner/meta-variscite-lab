SUMMARY = "Fast and well tested serialization library"
HOMEPAGE = "https://pypi.org/project/mashumaro/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e7bdee652937974f23d94be386c358bd"

SRC_URI[sha256sum] = "3844137cf053bbac30c4cbd0ee9984e839a5731a0ef96fd3dd9388359af3f2e1"

PYPI_PACKAGE = "mashumaro"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-typing-extensions \
"

BBCLASSEXTEND = "native nativesdk"

