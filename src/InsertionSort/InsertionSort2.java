package InsertionSort;

public class InsertionSort2 {
    private  String[] data;

    public void setData(String[] data) {this.data = data;}

    public void InsertionSort(){
        int size = this.data.length;

        for (int step = 1; step < size; step++){
            String key = this.data[step];
            int j = step-1;

            while (j>=0 && key.compareTo(this.data[j])<0) {
                this.data[j+1] = this.data[j]; --j;
            }
            this.data[j+1] = key;
        }
    }
    public void PrintSortedData(){
        for (String datum : this.data){
            System.out.println(datum + " ");
        }
    }

    public static void main(String[] args) {
        String[] nama = {"Windi","Budi","Susi","Agus", "Beni"};
        InsertionSort _pleaseSort = new InsertionSort();
        _pleaseSort.setData(nama);
        _pleaseSort.InsertionSort();
        _pleaseSort.PrintSortedData();
    }
}

