# Dotfiles

My personal dotfiles and setup scripts, powered by
[Dotbot](https://github.com/anishathalye/dotbot).

## Usage

```bash
git clone --recurse-submodules https://github.com/jakemarsden/dotfiles.git ~/.dotfiles

# Optional: ~/.dotfiles/setup/<program>/install
# Optional: ~/.dotfiles/setup/install-all

~/.dotfiles/install
source ~/.profile
```

Note that configurations are only linked for programs which are actually
installed at the time of `~/.dotfiles/install`. Whether a prograim is installed
is generally based on
[`command -v`](http://man7.org/linux/man-pages/man1/command.1p.html).

It may be necessary to re-run `~/.dotfiles/install` *after* installing a
package.

## Projects used

- [anishathalye/dotbot](https://github.com/anishathalye/dotbot)

### Bash

- [cykerway/complete-alias](https://github.com/cykerway/complete-alias)

### Vim

- [farmergreg/vim-lastplace](https://github.com/farmergreg/vim-lastplace)
- [glts/vim-magnum](https://github.com/glts/vim-magnum)
- [glts/vim-radical](https://github.com/glts/vim-radical)
- [itchyny/landscape.vim](https://github.com/itchyny/landscape.vim)
- [itchyny/lightline.vim](https://github.com/itchyny/lightline.vim)
- [rakr/vim-one](https://github.com/rakr/vim-one)
- [tpope/vim-abolish/](https://github.com/tpope/vim-abolish/)
- [tpope/vim-commentary](https://github.com/tpope/vim-commentary)
- [tpope/vim-fugitive](https://github.com/tpope/vim-fugitive)
- [tpope/vim-jdaddy](https://github.com/tpope/vim-jdaddy)
- [tpope/vim-repeat](https://github.com/tpope/vim-repeat)
- [tpope/vim-sensible](https://github.com/tpope/vim-sensible)
- [tpope/vim-speeddating](https://github.com/tpope/vim-speeddating)
- [tpope/vim-unimpaired](https://github.com/tpope/vim-unimpaired)
- [tpope/vim-vinegar](https://github.com/tpope/vim-vinegar)
- [vim-syntastic/syntastic](https://github.com/vim-syntastic/syntastic)
