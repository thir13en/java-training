# Logging

### Special Characters
`\n` is a `line feed (LF)` character, character code `10`. `\r` is a `carriage return (CR)` character, character code `13`. What they do differs from system to system. On Windows, for instance, lines in text files are terminated using `CR` followed immediately by `LF` (e.g., `CRLF`). On `Unix systems and their derivatives`, only `LF` is used. (Macs prior to Mac OS X used CR, but Mac OS X is a *nix derivative and so uses LF.)
In the old days, LF literally did just a line feed on printers (moving down one line without moving where you are horizonally on the page), and CR similarly moved back to the beginning of the line without moving the paper up, hence some systems (like Windows) sending CR (return to the left-hand side) and LF (and feed the paper up).
Because of all this confusion, some output targets will accept multiple line break sequences, so you could see the same effect from either character depending on what you're outputting to.
