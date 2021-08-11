# Lesson 07. Polymorphism.

As a hometask you will need to create a simulator of the filesystem. The
filesystem consists of files and directories:
* file has name and size;
* directory has name and keeps array of files and directories inside. For a
  sake of simplicity let's make the size of array fixed and equal to 1024.

File has methods to:
* get file name;
* get file size.

Directory has methods to:
* get directory name;
* add item (file or directory);
* remove file or directory by name;
* get array of the items it contains.

Create sample filesystem starting from root directory:
```
- root (2 items)
-- directoryA (2 items)
--- image.jpg 34678 bytes
--- document.txt 1234 bytes
-- directoryB (2 items)
--- image.png 78543 bytes
--- index.html 4563 bytes
```

And print the whole contents of filesystem to stdout using indents like in
example above.

Think about classes you need to create a filesystem. How they inherit each
other? Use toString() to convert objects to strings.
