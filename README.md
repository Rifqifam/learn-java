# Java Course

My 2-month journey learning Java from the ground up.

## What lives in this repo
Only the things that are the *same* on every machine:
- `src/` — my Java source code (`.java` files)
- `.gitignore` — tells git what NOT to track (compiled files, editor junk)
- `README.md` — this file

**The JDK / JVM is NOT in here.** Each computer installs its own (see below).
Git only carries the "recipe"; each machine brings its own "kitchen."

## One-time setup per machine

### macOS
```bash
# 1. Install Homebrew (skip if you already have it)
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

# 2. Install the Temurin LTS JDK
brew install --cask temurin

# 3. Verify
java -version
javac -version
```

### Windows
Install the Temurin LTS JDK from https://adoptium.net (the .msi installer),
tick "Add to PATH", then verify in PowerShell:
```powershell
java -version
javac -version
```

## Run the program (identical on both OSes)
```bash
cd src
javac Main.java   # compile:  .java  ->  .class (bytecode)
java Main         # run:      the JVM executes the bytecode
```
