package Collection.Queue;

import java.util.Objects;

public class StudentMarks implements Comparable<StudentMarks>{
    private int  maths;
    private int physics;


    public StudentMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }
    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    @Override
    public int compareTo(StudentMarks o) {

//       if(this.maths == o.maths){
//           return 0;
//       }
//       else if(this.maths>o.maths){
//           return 1;
//       } else {
//           return -1;
//       }

        System.out.println("Comparable compareTo is called");
        return o.maths-this.maths;
        // descending order
        // ascending order this.maths - o.maths
    }
    // It is in the class so that's why it has one.
    // comparator is not so there are  2 parameter ha.

    // same reference object.
    // An object reference is a link to an object

    // ye object class se arrha ha so hum object dalrha ha pen nhi dalrha h direct.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentMarks that = (StudentMarks) o;
        return maths == that.maths && physics == that.physics;
    }

    // hashCode ka kamm hota ha current object ko lo aur iska ek unique hashCode return ka try krwoo!!!
    @Override
    public int hashCode() {
        return Objects.hash(maths, physics);
    }
}
