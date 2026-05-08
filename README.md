meta-variscite-lab
==================

This layer provides software for a Variscite lab test-suite using labgrid.

What is included
================

- Image `var-image-labgrid` with:
  - Labgrid
  - Tailscale
  - SWUpdate
- Linux kernel bbappend to free GPIOs so they can be used for relays and to override DUT boot mode,
  user buttons, or power switch.
- Support for Linux Automation USB-SD-MUX devices.

Supported target
================

- Currently supported machine: `imx8mm-var-dart`
- Intended board/device-tree setup: `dt8mcustomboard`

Requirements
============

1. Clone dependency layers into your Yocto `sources` directory.

   git clone https://github.com/ChristophHandschuh/meta-tailscale.git
   git clone https://github.com/labgrid-project/meta-labgrid.git

2. Checkout the correct branch for `meta-labgrid`.

   cd meta-labgrid
   git checkout scarthgap
   cd ..

3. Add both layers to `bblayers.conf` (from your build directory).

   bitbake-layers add-layer ../sources/meta-tailscale
   bitbake-layers add-layer ../sources/meta-labgrid
   bitbake-layers add-layer ../sources/meta-variscite-lab

4. Confirm required packages are included by your image recipe.
   `var-image-labgrid` should include Labgrid, Tailscale, and SWUpdate support.

5. Build the image.

   bitbake var-image-labgrid
