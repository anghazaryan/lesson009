import java.util. *;
public class ListUtils{

	public int getEvenNumbers(final List<Integer> myNumbers){
	int counter = 0;
	for (int i = 0; i < myNumbers.size(); i++){
			if (myNumbers.get(i) % 2 == 0)  {
				counter++;

			}  			
    } 
        return counter;
}
    public boolean hasAscendingOrder(final List<Integer> myNumbers){
    	for (int i = 0; i < myNumbers.size() - 1; i++){
    		if (myNumbers.get(i) > myNumbers.get(i + 1))
    			return false;
    	}

    	return true;
    }

  public List<String> alphabeticalOrder(final List<String> newNames) {
    int n = newNames.size();
    String temporaryName;

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (newNames.get(j).compareTo(newNames.get(i)) < 0) {
                temporaryName = newNames.get(i);
                newNames.set(i, newNames.get(j));
                newNames.set(j, temporaryName);
            }
        }
    }

    return new ArrayList<>(newNames);
}

}


