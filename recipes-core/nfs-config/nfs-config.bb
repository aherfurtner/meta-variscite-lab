DESCRIPTION = "Variscite recipe to configure NFS path server"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://exports"

do_install () {
    install -m 0755 -d ${D}/nfs/rootfs
    install -Dm 0644 ${WORKDIR}/exports ${D}/${sysconfdir}/exports
}

RDEPENDS:${PN} += "nfs-utils"

FILES:${PN} += "/nfs/rootfs"
