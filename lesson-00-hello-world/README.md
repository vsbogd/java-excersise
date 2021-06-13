# Hometask

## Clone GitHub repo

Sign up at [GitHub main page](https://github.com/). Download and install the
Git client (see [Git downloads page](https://git-scm.com/downloads)).

Configure your name and email:
```
git config --global user.name "<your-name>"
git config --global user.email "<your-email>"
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

## Install Java Development Kit (JDK)

Download and install JDK (Java Development Kit):
- for x64 system use [Java SE 16.0.1](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html)
- for x86 system use [Java SE 8u291](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)

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

Run it again and see if message is updated.

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

Send me a link to your repo by email using subject `Java Lessons <your-name>`.
My email address:
```
                                           ***                           *                         
*   *   ****  *       ***    ***       *  *  **   ***    * *    ***   *  *      **    ***    * *   
*   *  *      *      *   *  *   *      *  * * *  *   *  * * *      *     *     *  *  *   *  * * *  
 * *    ***   ****   *   *  *   *   ****  *  **  *   *  * * *   ****  *  *     *     *   *  * * *  
 * *       *  *   *  *   *   ****  *   *  *       ****  * * *  *   *  *  *     *  *  *   *  * * *  
  *    ****   ****    ***       *   ****   ***       *  * * *   ****  *  *  *   **    ***   * * *  
                             ***                  ***                                              
```

# Links

- [A Visual Introduction to
  Git](https://medium.com/@ashk3l/a-visual-introduction-to-git-9fdca5d3b43a)
- [Pro Git Book](https://git-scm.com/book/ru/v2)
