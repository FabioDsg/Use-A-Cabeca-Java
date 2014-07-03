
public class GuessGame {
Player p1;
Player p2;
Player p3;

public void startGame(){
	
	p1 = new Player();
	p2 = new Player();
	p3 = new Player();
	
	int guessp1 = 0;
	int guessp2 = 0;
	int guessp3 = 0;
	
	boolean p1isRight = false;
	boolean p2isRight = false;
	boolean p3isRight = false;
	
	int targetNumber = (int) (Math.random() *10 );
	System.out.println("Estou pensando em um n�mero entre 0 e 9...");
	
	while(true){
		System.out.println("O n�mero a advinhar � " + targetNumber);
		p1.guess();
		p2.guess();
		p3.guess();
		
		guessp1 = p1.number;
		System.out.println("O jogador um forneceu o palpite " + guessp1);
		guessp1 = p2.number;
		System.out.println("O jogador doi forneceu o palpite " + guessp2);
		guessp1 = p3.number;
		System.out.println("O jogador tr�s forneceu o palpite " + guessp3);
		
		if (guessp1 == targetNumber){
			p1isRight = true;
		}
		if (guessp2 == targetNumber){
			p2isRight = true;
		}
		if (guessp3 == targetNumber){
			p3isRight = true;
		}
		if (p1isRight || p2isRight || p3isRight){
			System.out.println("Temos um vencedor");
			System.out.println("O jogador um acertou ?" + p1isRight);
			System.out.println("O jogador dois acertou?" + p2isRight);
			System.out.println("O jogador tr�s acertou?" + p3isRight);
			System.out.println("Fim do jogo!");
			break; //fim do jogo, sai do loop
			
		}else{
			//devemos continuar porque ningu�m acertou
			System.out.println("Os jogadores ter�o que tentar novamente!");
		}
	}
  }
}
