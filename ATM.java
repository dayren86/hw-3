public class ATM{
        public int countBanknotes(int sum){
            int result = 0;
            int[] banknotes = {500,200,100,50,20,10,5,2,1};
            int index = 0;
            int count = banknotes.length;
            while(count > 0){
                 result += sum / banknotes[index];
                 sum = sum % banknotes[index];
                index++;
                count--;
            }
            return result;
        }
}
   

