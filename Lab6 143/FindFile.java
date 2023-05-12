import java.io.File;

/**
 * Author: Hadi Chohan
 * 
 * Description: This class runs on searching algorithm that
 * locates the target file and tells all the paths it found it on.
 * 
 * Precondition: The file must exist.
 * 
 * Postcondition: File paths are given and its occurences.
 */

public class FindFile {
    private int maxFiles;
    private String[] found;
    private int count = 0;

    /**
     * Constructor that takes the maximum number
     * of files to find.
     * 
     * @param m
     */
    public FindFile(int m) {
        this.maxFiles = m;
        found = new String[0];
    }

    /**
     * Runs the searching algorithm for the file
     * and throws exception if file not found.
     * 
     * @param name
     * @param path
     */
    public void directorySearch(String name, String path) {
        File outerPath = new File(path);// To search through the first/primary directory
        String[] nameList = outerPath.list();// To store the path of all the first/primary directories.

        for (int i = 0; i < nameList.length; i++) {
            // To store the second/sub directory which also includes first directory's path.
            File innerPath = new File(path + "\\" + nameList[i]);

            if (!innerPath.isDirectory()) {
                if (nameList[i].equals(name)) {
                    String[] temp = new String[found.length + 1];

                    for (int j = 0; j < found.length; j++) {
                        temp[j] = found[j];
                    }

                    found = temp;
                    found[count] = path + "\\" + nameList[i];
                    count++;

                    if (count > maxFiles) {
                        throw new ItemNotFoundException("Exceeded max number of files to find");
                    }
                }
            }

            else {
                directorySearch(name, path + "\\" + nameList[i]);
            }
        }
    }

    /**
     * returns the total amount files found.
     * 
     * @return
     */
    public int getCount() {
        return count;
    }

    /**
     * returns all the paths the file was found on.
     * 
     * @return
     */
    public String[] getFiles() {
        return found;
    }
}
