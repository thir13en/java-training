# JDK in Linux

### Amazon Correto
1. Install `Amazon Corretto`, there are Debian and Red Hat packages.
2. Install `java-common` with your package manager.
3. After installing, remember to run `sudo update-alternatives --config java` and select the appropiate Amazon Corretto alternative.
3. Also check `javac` version with `sudo update-alternatives --config javac`.

### OpenJDK with AdoptOpenJDK
1. Access https://adoptopenjdk.net/releases.html
1. Select your OS and CPU Architecture
1. Download the JDK
1. Extract the `.tar.gz` file.
1. Move it into `/usr/bin/`.
1. Export it's path by running `$ export PATH=$PWD/jdk-11.0.8+10/bin:$PATH` in the folder root.
1. Check it is being used by running `$ javac -version` and `$ java -version`
Side note: there are also `.deb` and `.rpm` packages available.

### AdoptOpenJDK fedora `rpm` installer
1. Create a file named `/etc/yum.repos.d/adoptopenjdk.repo`
1. Fill it with 
```
name=AdoptOpenJDK $releasever - $basearch
baseurl=https://adoptopenjdk.jfrog.io/adoptopenjdk/rpm/fedora/$releasever/$basearch
enabled=1
gpgcheck=1
gpgkey=https://adoptopenjdk.jfrog.io/adoptopenjdk/api/gpg/key/public
```
3. Run `sudo dnf check-update`
1. Install with `sudo yum install adoptopenjdk-11-openj9`
