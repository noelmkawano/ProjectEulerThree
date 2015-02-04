/**
 * Created by NOEL on 2/3/2015.
 */
public class ProjectEulerThree {
  public static void main(String[] args) {
    Long x=600851475143L;
    //int x = 13195;
    int c = 0;
    int[] array;
    array = new int[10000];
    for (int i = 1; i < x; i++) {
      if (x % i == 0) {
        array[c] = i;
        c = c + 1;
      }
      //System.out.println(i);

    }
    for (int s = 0; s <= c; s++) {
      int z = 0;
      for (int a = 2; a < array[s]; a++) {
        if (array[s] % a == 0) {
          a = array[s];
          z = 1;
        }
      }
      if (z != 1) {
        System.out.println(array[s]);
      }
    }
  }
}
