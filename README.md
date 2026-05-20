meta-variscite-lab
==================

This layer provides software for a Variscite lab test-suite using labgrid.

What is included
================

- Image `var-image-labgrid` with:
  - Labgrid
  - Tailscale
  - SWUpdate
- Linux kernel bbappend to free GPIOs to be used with relays, boot mode or user button control.
- Support for Linux Automation USB-SD-MUX devices.

Supported target
================

- Currently supported machine: `imx8mm-var-dart`
- Intended board/device-tree setup: `dt8mcustomboard`

Usage
=====

1. Clone dependency layers into your Yocto `sources` directory.

meta-tailscale:
```sh
   git clone https://github.com/ChristophHandschuh/meta-tailscale.git
```

meta-labgrid:
```sh
   git clone https://github.com/labgrid-project/meta-labgrid.git
```
2. Checkout target branch for `meta-labgrid`.

```sh
   git -C ./meta-labgrid switch scarthgap
```

3. Add both layers to `bblayers.conf` (from your build directory).

```sh
   bitbake-layers add-layer ../sources/meta-tailscale;
   bitbake-layers add-layer ../sources/meta-labgrid
```

And `meta-variscite-lab`as well:
```sh
   bitbake-layers add-layer ../sources/meta-variscite-lab
````

4. Build the image.

   bitbake var-image-labgrid
