package stream.parllelstreams;

import java.util.ArrayList;
import java.util.List;

public class ParllelStream {
    public static void main(String[] args)
    {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long start = System.currentTimeMillis();
       getStudentList().stream()
               .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.println("This sequential stream takes : "+(end-start));

        System.out.println("---------------------------------------------------------");
        long start1 = System.currentTimeMillis();

        getStudentList().stream()
                .parallel()
                .forEach(System.out::println);

        long end1 = System.currentTimeMillis();
        System.out.println("This sequential stream takes : "+(end1-start1));
/**
 *  1.Sequential stream : This stream will process the data in sequential manner
 *                        for example while we are running this stream it will only allocate
 *                        a single core & single thread at a time.
 *                        Note : Follows insertion order
 *
 *                        Ex Code:  getStudentList().stream()
 *                                       .sequential()
 *                                       .forEach(System.out::println);
 *
 *  2.Parallel Stream   : This stream will process the data in parallel manner
 *                        for example while we are running the parallel stream it will split the data
 *                        into chunks allocates to all the core's and process the data faster than
 *                        sequential stream.
 *                        Note : It will not follow insertion order
 *
 *                        Ex Code:  getStudentList().stream()
 *                                        .parallel()
 *                                        .forEach(System.out::println);
 *
 *  Note : A Stream can be a parallel stream or sequential stream. It cannot be both....!
 */

    }

  public static List<StudentInfo> getStudentList()
  {
      List<StudentInfo> studentInfoList = new ArrayList<StudentInfo>();

      StudentInfo k = new StudentInfo(1, "Krishna", 1234, "bsc");
      StudentInfo r = new StudentInfo(2, "Ram", 1234871, "bsc");
      StudentInfo y = new StudentInfo(3, "yash", 12344590, "bsc");
      StudentInfo t = new StudentInfo(4, "tony", 1234234, "bsc");
      StudentInfo e = new StudentInfo(5, "erwin", 1234876, "bsc");
      StudentInfo l = new StudentInfo(6, "levi", 15432, "bsc");
      StudentInfo s = new StudentInfo(7, "sasha", 1234098, "bsc");

      studentInfoList.add(k);
      studentInfoList.add(r);
      studentInfoList.add(y);
      studentInfoList.add(t);
      studentInfoList.add(e);
      studentInfoList.add(l);
      studentInfoList.add(s);








      return studentInfoList;
  }
}
