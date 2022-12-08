import java.math.BigDecimal;
import java.util.*;

public class Klas {
    public static void main(String[] args) {
        /**      Java Collection: LinkedList Exercises [7 көнүгүү]
         1. LinkedList тизменин биринчи элементин алуу үчүн Java программасын жазыңыз.**/
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("Kurstan");
//        linkedList.add("Baiysh");
//        linkedList.add("Ilim");
//        linkedList.add("Nurdil");
//        linkedList.add("Jenish");
//        System.out.println(linkedList.getFirst());

        /** 2. LinkedList тизменин акыркы элементин алуу үчүн Java программасын жазыңыз. **/

//        System.out.println(linkedList.getLast());
        /**  3. LinkedList тизмеде белгилүү бир элемент бар же жок экенин текшерүү үчүн Java программасын жаз. **/
//        System.out.println(linkedList.contains("Jenish"));

        /** 4. LinkedList тизмени массивдердин тизмесине которуу үчүн Java программасын жазыңыз. **/
//                LinkedList<String>stringLinkedList = new LinkedList<>(linkedList);
//        System.out.println(stringLinkedList);

        /**5. Эки LinkedList тизмесин салыштыруу үчүн Java программасын жазыңыз.  **/
//        System.out.println(linkedList.equals(stringLinkedList));
        /**  6. LinkedList тизме бош же жок экенин текшерүү үчүн Java программасын жазыңыз.     **/
//                System.out.println(stringLinkedList.isEmpty());
        /**   7. LinkedList тизмедеги элементти алмаштыруу үчүн Java программасын жазыңыз.     **/
//                 linkedList.set(1,"Nursayit");
//        System.out.println(linkedList);
        /**   __________________________________________________________________________________________

         Java Collection: HashSet Exercises [12 көнүгүү]

         The Hash Set: [
         new BankAccount("OPTIMA","41692222" "7000")
         new BankAccount("KYRGYZSTAN","41691111" "5000")
         new BankAccount("DEMIR","41693333" "9000")
         new BankAccount("RSK","41694444" "100000")
         ]

         1. Көрсөтүлгөн элементти HashSet топтомунун аягына кошуу үчүн Java программасын жазыңыз.      **/
//             HashSet<BanAccount> banAccounts = new HashSet<>();
//                    banAccounts.add(new BanAccount("OPTIMA","44323212", new BigDecimal(7000)));
//                  banAccounts.add(new BanAccount("KYRGYZSTAN","44323243555", new BigDecimal(8000)));
//                  banAccounts.add(new BanAccount("BAKAY","44353", new BigDecimal(9000)));
//                  banAccounts.add(new BanAccount("KEREMET","44323423", new BigDecimal(12000)));
//
//                      banAccounts.forEach(System.out::println);
//        System.out.println();
//
//           banAccounts.add(new BanAccount("HALYK","398576876", new BigDecimal(23432)));
//        banAccounts.forEach(System.out::println);
//
        /**  2. HashSet тизмедеги бардык элементтерди кайталоо үчүн Java программасын жазыңыз.      **/
//
//        for (BanAccount banAccount : banAccounts) {
//            System.out.println(banAccount);
//        }


        /**         3. HashSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.         **/
        //      System.out.println(banAccounts.size());
        /**     4. HashSet топтомун бошотуу үчүн Java программасын жазыңыз.              **/
        //                                banAccounts.clear();
        /** 5. HashSet топтомунун бош же жок экенин текшерүү үчүн Java программасын жазыңыз.  **/
        //   System.out.println(banAccounts.isEmpty());
        /**    6. HashSet топтомун башка хэш топтомуна клондоо үчүн Java программасын жазыңыз.      **/
//            Set<BanAccount> banAccounts2 = new HashSet<>();

//                 banAccounts.add(new BanAccount("OPTIMA","44323212", new BigDecimal(7000)));
//                 banAccounts.add(new BanAccount("SBERBAMK","44323243555", new BigDecimal(8000)));

//        System.out.println("7");
        /**   7. HashSet топтомун массивге айландыруу үчүн Java программасын жазыңыз.                   **/
//                  ArrayList<BanAccount> banAccounts1 = new ArrayList<>();
//                  banAccounts1.addAll(banAccounts);
//                   banAccounts1.forEach(System.out::println);
//        System.out.println("8");
        /**   8. HashSet топтомун трисет топтомуна айландыруу үчүн Java программасын жазыңыз.                **/
//        TreeSet<HashSet<BanAccount>> treeSet = new TreeSet<HashSet<BanAccount>>();
//        for (HashSet<BanAccount> banAccount : treeSet) {
//            treeSet.add(banAccounts);
//            System.out.println(banAccount);
//        }
//        /**         9. HshSet топтомун List/ ArrayListке айландыруу үчүн Java программасын жазыңыз.                     **/
//        List<BanAccount> banAccountList = new ArrayList<>(banAccounts);
//        System.out.println(banAccountList);

        /**     10. Эки HashSet топтомун салыштыруу үчүн Java программасын жазыңыз.                                      **/
//          Set<String> strings = new HashSet<>();
//          strings.add("Baiysh");
//          strings.add("Janysh");
//          strings.add("Jenish");
//          Set<String> strings2 = new HashSet<>();
//          strings2.add("Baiysh");
//          strings2.add("Klych");
//          strings2.add("Jenish");
//        System.out.println(strings.equals(strings2));


/**          11. Эки топтомду салыштыруу жана эки топтомдо бирдей элементтерди сактоо үчүн Java программасын жазыңыз.      **/
//            Set<String> set = new HashSet<>();
//         for (String s : strings){
//             for (String a :strings2){
//                 if (s.equals(a)){
//                     set.add(s);
//
//                 }
//             }
//         }System.out.println(set);
        /**      12. HashSet топтомунан бардык элементтерди алып салуу үчүн Java программасын жазыңыз.                              **/
//          set.clear();
        /**         _____________________________________________________________________________________________                           **/

        /**     Java Collection: TreeSet Exercises [16 көнүгүүлөр]                                                                           **/

        /**     1. Жаңы TreeSet топтомун түзүү үчүн Java программасын жазыңыз, бир нече түстөрдү  кошуп, TreeSet топтомун басып чыгарыңыз.        **/
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("blue");
        treeSet.add("black");
        treeSet.add("Red");
        treeSet.add("Green");
        System.out.println(treeSet);
        /**     2. TreeSet топтомундагы бардык элементтерди кайталоо үчүн Java программасын жазыңыз.                                                   **/
//        for (String s : treeSet) {
//            System.out.println(s);
//        }
        /**        3. Белгиленген TreeSet топтомунун бардык элементтерин башка TreeSet топтомуна кошуу үчүн Java программасын жазыңыз.     **/
//         TreeSet<String> stringTreeSet = new TreeSet<>();
//         stringTreeSet.addAll(treeSet);
//        System.out.println(stringTreeSet);
        /**      4. Берилген TreeSet топтомундагы элементтердин тескери иреттүү көрүнүшүн түзүү үчүн Java программасын жазыңыз.              **/
//        TreeSet<String> stringTreeSet = new TreeSet<>(Comparator.reverseOrder());
//        stringTreeSet.addAll(treeSet);
//        System.out.println(stringTreeSet);
        /**     5. TreeSet топтомундагы биринчи жана акыркы элементтерди алуу үчүн Java программасын жазыңыз.                                   **/
//        System.out.println(treeSet.pollLast());
//        System.out.println(treeSet.pollFirst());
        /**   6. TreeSet тизмегин башка TreeSet топтомуна клондоо(clone) үчүн Java программасын жазыңыз.
         *  **/
//        TreeSet<String> stringTreeSet = new TreeSet<>();
//        stringTreeSet.addAll(treeSet);
//        System.out.println(stringTreeSet);

        /**   7. TreeSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.                                                        **/
//        System.out.println(treeSet.size());
        /**        8. Эки TreeSet топтомун салыштыруу үчүн Java программасын жаз.                                                                              **/
        TreeSet<Integer> treeSet3 = new TreeSet<>();
        treeSet3.add(9);
        treeSet3.add(3);
        treeSet3.add(4);
        treeSet3.add(10);
        System.out.println(treeSet3);
//        System.out.println("_--------------------");
//        for (Integer integer : treeSet3) {
//            if (integer < 7){
//                System.out.println(integer);
//            }
//        }
//        System.out.println("-----------------");
/**          9. Tree топтомундагы 7ден аз сандарды табуу үчүн Java программасын жаз.
 *  **/
//        for (Integer s: treeSet3) {
//            if (s>=4){
//                System.out.println(s);
//
//            }
//        }
//        /**        10. Берилген элементтен чоң же ага барабар болгон TreeSet жыйындысынын элементин алуу үчүн Java программасын жазыңыз.                               **/
//        for (Integer s: treeSet3) {
//            if (s<=4){
//                System.out.println(s);
//
//            }
//        }
        /**     11. Берилген элементтен кичине же ага барабар болгон TreeSet топтомундагы элементти алуу үчүн Java программасын жазыңыз.
         *  **/
//        System.out.println(treeSet3.first());
//        System.out.println(treeSet3.last());
//        treeSet3.pollFirst();
//        treeSet3.pollLast();
//        System.out.println(treeSet3);

        /**     12. TreeSet топтомунун биринчи элементин алуу жана алып салуу үчүн Java программасын жазыңыз.                                                               **/

//        System.out.println(treeSet3.pollFirst());
        /**    13. TreeSet топтомунун акыркы элементин алуу жана алып салуу үчүн Java программасын жазыңыз.                                                                    **/
//        System.out.println(treeSet3.pollLast());
        /**     14. Берилген элементти TreeSet жыйындысынан алып салуу үчүн Java программасын жазыңыз.
         *  **/
//        treeSet3.clear();

    }
}
