# JDK in Linux


1. Install `Amazon Corretto`, there are Debian and Red Hat packages.
2. Install `java-common` with your package manager.
3. After installing, remember to run `sudo update-alternatives --config java` and select the appropiate Amazon Corretto alternative.
3. Also check `javac` version with `sudo update-alternatives --config javac`.
