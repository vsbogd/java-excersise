# Hometask

## Clone GitHub repo

Sign up at [GitHub main page](https://github.com/). Download and install the
Git client (see [Git downloads page](https://git-scm.com/downloads)).

Configure your name and email:
```
git config --global user.name "<your-name>"
git config --global user.email "<your-email>"
git config --global core.editor "notepad"
git config --global credential.helper wincred
```

Check your name and email are set properly:
```
git config --global user.name
git config --global user.email
```

Fork [java lessons repo](https://github.com/vsbogd/java-lessons).
Clone your fork of the java lessons:
```
git clone https://github.com/<your-github-username>/java-lessons
```

Generate new personal access tocken at [Personal access token
page](https://github.com/settings/tokens). You need doing it once, then git
client caches the token and use it automatically. Copy token into clipboard.

Check your new token:
```
git push origin main
```
Git will ask you for your username and password. Use the token as a password.


## Install Java Development Kit (JDK)

Download and install JDK (Java Development Kit):
- for x64 system use [Liberica JDK 11](https://download.bell-sw.com/java/11.0.11+9/bellsoft-jdk11.0.11+9-windows-amd64.msi)
- for x86 system use [Liberica JDK 11](https://download.bell-sw.com/java/11.0.11+9/bellsoft-jdk11.0.11+9-windows-i586.msi)

Use your favorite text editor for editing files. I would recommend
using `Geany` a small editor with a syntax highlighting ([Geany download
page](https://www.geany.org/download/releases/)).

## Experiment with HelloWorldApp

Change directory to the `lesson-00-hello-world` and run HelloWorldApp:
```
java HelloWorldApp
```

Edit `HelloWorldApp.java` and replace the message to the `Hello from
<your-name>`. Compile new version using:
```
javac HelloWorldApp.java
```

Run it again and see if the message is updated.

## Save results of experiment in your fork

Look at your changes:
```
git status
git diff
```

Commit the changes:
```
git add .
git commit
```

Push your changes into the remote repo:
```
git push origin main
```

Send me a link to your repo by an email using subject `Java Lessons
<your-name>`.  My email address is:
```
                                           @@@                           l                         
v   v   ssss  b       ooo    ggg       d  @  @@   ggg    m m    aaa   i  l      cc    ooo    m m   
v   v  s      b      o   o  g   g      d  @ @ @  g   g  m m m      a     l     c  c  o   o  m m m  
 v v    sss   bbbb   o   o  g   g   dddd  @  @@  g   g  m m m   aaaa  i  l     c     o   o  m m m  
 v v       s  b   b  o   o   gggg  d   d  @       gggg  m m m  a   a  i  l     c  c  o   o  m m m  
  v    ssss   bbbb    ooo       g   dddd   @@@       g  m m m   aaaa  i  l  .   cc    ooo   m m m  
                             ggg                  ggg                                              
```

# Links

- [A Visual Introduction to
  Git](https://medium.com/@ashk3l/a-visual-introduction-to-git-9fdca5d3b43a)
- [Pro Git Book](https://git-scm.com/book/ru/v2)
- [Head First Java](https://eksmo.ru/book/izuchaem-java-ITD185236/)
