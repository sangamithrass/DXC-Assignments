package arraylist_1;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static List<Participant> generateListOfFinalists(Participant[] finalists) {
        List<Participant> finalistList = new ArrayList<>();
        for (Participant finalist : finalists) {
            finalistList.add(finalist);
        }
        return finalistList;
	}

	public static List<Participant> getFinalistsByTalent(List<Participant> finalists, String talent) {
        List<Participant> filteredList = new ArrayList<>();
        for (Participant finalist : finalists) {
            if (finalist.getParticipantTalent().equals(talent)) {
                filteredList.add(finalist);
            }
        }
        return filteredList;
	}

	public static void main(String[] args) {
		Participant finalist1 = new Participant("Hazel", "Singing", 91.2);
		Participant finalist2 = new Participant("Ben", "Instrumental", 95.7);
		Participant finalist3 = new Participant("John", "Singing", 94.5);
		Participant finalist4 = new Participant("Bravo", "Singing", 97.6);

		Participant[] finalists = { finalist1, finalist2, finalist3, finalist4 };

		List<Participant> finalistsList = generateListOfFinalists(finalists);

		System.out.println("Finalists");
		for (Participant finalist : finalistsList)
			System.out.println(finalist);

		String talent = "Singing";
		System.out.println("Finalists in " + talent + " category");

		List<Participant> finalistsCategoryList = getFinalistsByTalent(finalistsList, talent);
		for (Participant finalist : finalistsCategoryList)
			System.out.println(finalist);
		
		Participant finalist_2_1 = new Participant("Mark", "Instrumental", 81.2);
		Participant finalist_2_2 = new Participant("Ella", "Instrumental", 65.7);
		Participant finalist_2_3 = new Participant("Lily", "Singing", 86.5);

		Participant[] finalists_2 = { finalist_2_1, finalist_2_2, finalist_2_3 };

		List<Participant> finalistsList_2 = generateListOfFinalists(finalists_2);
		System.out.println("\nfinalists_2");
		for (Participant finalist_2 : finalistsList_2)
			System.out.println(finalist_2);

		String talent_2 = "Singing_2";
		System.out.println("Finalists in " + talent_2 + " category");

		List<Participant> finalistsCategoryList_2 = getFinalistsByTalent(finalistsList_2, talent);
		for (Participant finalist_2 : finalistsCategoryList_2)
			System.out.println(finalist_2);
	}

}