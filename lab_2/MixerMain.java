package lab_2;
import java.util.Scanner;

class Mixer{
    int[] arr;
    int n;
    Scanner mix_sc = new Scanner(System.in);
    
    void accept(int n){
        int i = 0;
        this.arr = new int[n];
        while (i < n){
            boolean exists = false;
            System.out.print("Enter array element: ");
            int ele = this.mix_sc.nextInt();
            for (int item: this.arr){
                if (ele == item){
                    System.out.println("Element already exists");
                    exists = true;
                    break;
                }
            }
            if (!exists){
                this.arr[i] = ele;
                i++;
            }
        }
    }

    Mixer mix(Mixer A){
        Mixer new_mix = new Mixer();
        new_mix.arr = new int[this.arr.length + A.arr.length];
        int i = 0, j;
        
        for (int ele: this.arr){
            new_mix.arr[i] = ele;
            i++;
        }

        for (int ele: A.arr){
            new_mix.arr[i] = ele;
            i++;
        }

        for (i = 0; i < new_mix.arr.length - 1; i++){
            for (j = 0; j < new_mix.arr.length - 1; j++){
                if (new_mix.arr[j] > new_mix.arr[j+1]){
                    int temp = new_mix.arr[j];
                    new_mix.arr[j] = new_mix.arr[j+1];
                    new_mix.arr[j+1] = temp;
                }
            }
        }

        return new_mix;
    }

    protected void finalize(){
        this.mix_sc.close();
    }
}

public class MixerMain {
    public static void main(String[] args) {
        Mixer mix1 = new Mixer();
        mix1.accept(3);

        Mixer mix2 = new Mixer();
        mix2.accept(3);

        Mixer mix3 = mix1.mix(mix2);
        for (int ele: mix3.arr){
            System.err.println(ele);
        }
    }
}
