import java.util. *;
public class Main{
	public static void main(String[] args){


	final List<String> newNames = new ArrayList<>(); 
	newNames.add("Gagik");
	newNames.add("Anna");
	newNames.add("Mkhitar");
    newNames.add("Tatev");
    newNames.add("Elen");
    newNames.add("Anahit");
    newNames.add("Maria");
    newNames.add("Ella");
    newNames.add("Emma");
    newNames.add("Gagik");
	newNames.add("Anna");
	newNames.add("Mkhitar");
    newNames.add("Tatev");
    newNames.add("Elen");
    newNames.add("Anahit");
    newNames.add("Maria");
    newNames.add("Ella");
    newNames.add("Emma");
    
    
	final ArrayList<Integer> randomNumber = new ArrayList<>();
	randomNumber.add(1);
	randomNumber.add(2);
	randomNumber.add(115);
	randomNumber.add(8);
	randomNumber.add(19);
	randomNumber.add(1);
	randomNumber.add(8);
	randomNumber.add(99);
	randomNumber.add(14);
	randomNumber.add(5);
	randomNumber.add(13);
	randomNumber.add(99);
	randomNumber.add(5);

	        HashSet<Integer> hset = new HashSet<Integer>(randomNumber);
	         System.out.println("ArrayList Unique Values is : "
                           + hset);


	final List<Integer> myNumbers = new ArrayList<>();
	myNumbers.add(1);
	myNumbers.add(2);
	myNumbers.add(3);
	myNumbers.add(8);
	myNumbers.add(20);
	myNumbers.add(21);
	myNumbers.add(88);
	myNumbers.add(99);
	myNumbers.add(114);
	myNumbers.add(115);
	myNumbers.add(133);
	myNumbers.add(747);
	myNumbers.add(5566);


	final TreeMap<Integer,String> namelist = new TreeMap<>();
	namelist.put(4, "Mariam");
	namelist.put(5, "Hayk");
	namelist.put(8, "Suren");
	namelist.put(11, "Narine");
	namelist.put(5, "Anna");
	namelist.put(22, "Viktoria");
	namelist.put(31, "Hayk");
	namelist.put(18, "Astghik");
	namelist.put(25, "Arev");
	namelist.put(55, "Emma");
	namelist.put(36, "Mikayel");


	final ListUtils listUtil = new ListUtils();
	System.out.println(listUtil.getEvenNumbers(myNumbers));
	System.out.println(listUtil.hasAscendingOrder(myNumbers));
	System.out.println(namelist);
	System.out.println("-----------------------------------------");
	System.out.println(randomNumber);
	System.out.println("-----------------------------------------");
    System.out.println(listUtil.alphabeticalOrder(newNames));




	}
}