/* Before refactoring (Original version) */
public class A
{
    public int f; /* printF , printF, */
     /* printF , printG, */
    public string h; /* printH */

    // Method 1
    void printF(int i)
    {
        this.f = i * this.f;
    }

    // Method 2
    void printF(float i){
        this.f = (int) (i * this.f);
        this.g = (int) (i * this.g);
    }

    // Method 3
    

    // Method 4
    void printH(){
        print(this.h);
    }
}

class B {

	public string g;


	// Method moved to class B
	void printG(){
        print(this.g);
    }
}
