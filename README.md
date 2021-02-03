# Rel

Easily access a file relative to the current one in SuperCollider.

## Description

`Rel` takes a string as input and returns the absolute path relative to the current file's directory.

Example:

```sc
// Assuming currently loaded file is C:/User/Bits/SC/main.scd
Rel("sounds/kick.wav").postln; // -> C:/User/Bits/SC/sounds/kick.wav

// You can easily separate your code in multiple files
Rel("synths.scd").load;
Rel("patterns.scd").load;
```

## Installation

Run this line of code:
```sc
Quarks.install("https://github.com/bitsbearer/Rel.git");
```

After the installation finishes go to the Language menu > Recompile class library to be able to use it.

## License

Licensed under MIT (c) 2021 Bits Bearer

## Contact

Folloe me on:
* Youtube: https://youtube.com/channel/UCjz2uft6ZzzewU4Kt42ftUg
* Twitter: https://twitter.com/bitsbearer
* Instagram: https://instagram.com/bitsbearer
* Facebook: https://facebook.com/bitsbearer
* SoundCloud: https://soundcloud.com/bitsbearer