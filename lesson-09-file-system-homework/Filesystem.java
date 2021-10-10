class FilesystemItem {

	private String name;

	protected FilesystemItem(String name) {
		this.name = name;
	}

	public String getName() {
		return name/*.clone()*/;
	}
}

class File extends FilesystemItem {

	private int size;

	public File(String name, int size) {
		super(name);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public String toString() {
		return getName() + " " + size + " bytes";
	}
}

class Directory extends FilesystemItem {

	private FilesystemItem[] items;
	private int count;

	public Directory(String name) {
		super(name);
		this.items = new FilesystemItem[1024];
		this.count = 0;
	}

	public FilesystemItem[] getItems() {
		return items.clone();
	}

	public boolean addItem(FilesystemItem item) {
		if (count < items.length && getItemByName(item.getName()) == null) {
			items[count] = item;
			count++;
			return true;
		} else {
			return false;
		}
	}

	public FilesystemItem getItemByName(String name) {
		for (int i = 0; i < count; ++i) {
			if (items[i].getName().equals(name)) {
				return items[i];
			}
		}
		return null;
	}

	public boolean removeItem(String name) {
		int shift = 0;
		boolean success = false;
		for (int i = 0; i < count; ++i) {
			if (items[i].getName().equals(name)) {
				shift++;
				count--;
				success = true;
			} else {
				items[i - shift] = items[i];
			}
		}
		return success;
	}

	public String toString() {
		String result = getName() + " (" + count + " items)";
		for (int i = 0; i < count; i++) {
			FilesystemItem item = items[i];
			String itemAsString = item.toString();
			result = result + "\n" + itemAsString;
		}
		return result;
	}

}

public class Filesystem {

	public static void main (String[] args) {
		Directory root = new Directory("root");

		Directory dirA = new Directory("directoryA");
		dirA.addItem(new File("image.jpg", 34678));
		dirA.addItem(new File("document.txt", 1234));
		root.addItem(dirA);

		Directory dirB = new Directory("directoryB");
		dirB.addItem(new File("image.png", 78543));
		dirB.addItem(new File("index.html", 4563));
		root.addItem(dirB);

		System.out.println(root);

		String expected = "root (2 items)\n" +
			"directoryA (2 items)\n" +
			"image.jpg 34678 bytes\n" +
			"document.txt 1234 bytes\n" +
			"directoryB (2 items)\n" +
			"image.png 78543 bytes\n" +
			"index.html 4563 bytes";
		if (root.toString().equals(expected)) {
			System.out.println("Ok");
		} else {
			System.out.println("Error");
		}

	}
}
