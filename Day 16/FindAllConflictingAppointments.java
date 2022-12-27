import java.util.*;

public class FindAllConflictingAppointments {

    public static void main(String[] args) {
        Interval[] intervals = new Interval[6];
        intervals[0] = new Interval(1, 5);
        intervals[1] = new Interval(3, 7);
        intervals[2] = new Interval(2, 6);
        intervals[3] = new Interval(10, 15);
        intervals[4] = new Interval(5, 6);
        intervals[5] = new Interval(4, 100);

        List<Interval> result = findConflictingAppointments(intervals);
        System.out.print("Conflicting appointments: ");
        for (Interval interval : result)
            System.out.print("[" + interval.start + "," + interval.end + "] ");
    }

    private static List<Interval> findConflictingAppointments(Interval[] intervals) {
        List<Interval> result = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        Interval previous = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            Interval current = intervals[i];
            if (previous.end >= current.start) {
                result.add(previous);
                result.add(current);
            }
            previous = current;
        }
        return result;
    }
}

class Interval  {
    int start, end;
}