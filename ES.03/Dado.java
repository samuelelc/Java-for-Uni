public class Dado{
	int lancia(){
		/*return (int) Math.round(Math.random()*5.49+1);		//al prof non piace il cast esplicito

		non va bene, perchè non tutti i casi hanno le stesse probabilità
		
		Report di 10_000 casi:
		1:      1822 casi
		2:      3576 casi
		3:      3694 casi
		4:      3741 casi
		5:      3564 casi
		6:      3603 casi

*/

		double c = Math.random() * 6;

		if(c >= 0 && c < 1){
			return 1;
		} else if(c >=1 && c < 2){
			return 2;
		} else if(c >=2 && c < 3){
			return 3;
		} else if(c >=3 && c < 4){
			return 4;
		} else if(c >=4 && c < 5){
			return 5;
		} else if(c >=5 && c < 6){
			return 6;
		} 
		
		return 1;
	}
}