SUMMARY = "Composable command line interface toolkit, async fork"
HOMEPAGE = "https://pypi.org/project/asyncclick/"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1fa98232fd645608937a0fdc82e999b8"

SRC_URI[sha256sum] = "8a80d8ac613098ee6a9a8f0248f60c66c273e22402cf3f115ed7f071acfc71d3"

SRC_URI += "file://0001-pyproject-fix-metadata-for-flit-core.patch"

PYPI_PACKAGE = "asyncclick"

inherit pypi python_flit_core

BBCLASSEXTEND = "native nativesdk"
