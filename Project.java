/**
 * @author Entwickler: oemran2s
 */

package se_02;

public class Project {
	private String[][] order;

	public Project(String[][] order) {
		this.order = order;
	}

	public boolean isWellSorted(String[] seq) {
		for (int i = 0; i < seq.length - 1; i++) {
			if (seq[i].compareTo(seq[i + 1]) > 0) {
				return false;
			}
		}
		return true;
	}
}
