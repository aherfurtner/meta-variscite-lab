FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " file://override.conf"

do_install:append() {
    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        install -d ${D}${systemd_unitdir}/system/tailscaled.service.d
        install -m 0644 ${WORKDIR}/override.conf \
            ${D}${systemd_unitdir}/system/tailscaled.service.d/override.conf
    fi
}

FILES:${PN}:append = " ${systemd_unitdir}/system/tailscaled.service.d/override.conf"
