import java.util.Arrays;
public class Challenge {
  public static boolean isPalindromePossible(String str) {
		//Cria um Array "a" da String fornecida
		char a[] = str.toCharArray();
		//Organiza o Array "a" em ordem alfabética
		Arrays.sort(a);
		/*Cria variável inteira b, que serve para contar quantos caracteres
		tem um numero impar dele mesmo no Array
		*/
		int b = 0;
		/*Cria variável inteira c, que serve para contar a quantidade de 
		caracteres no Array
		*/
		int c = 0;
		//loop que compara um caractere com o seu subsequente
		for (int i = 0;i<a.length-1;i++){
			//verifica se um caractere é igual ao próximo
			if (a[i] == a[i+1]){
				//se for igual, conta e passa para o próximo
				c++;
			}
			else {
				//se for diferente, verifica se a contagem é impar, caso seja, somaa contagem
				if (c%2 == 0){
					b++;
				}
				//caso negativo, zera a contagem do caractere, e passa para o próximo
				c = 0;
			}
		}		
		/*se tiver uma quantidade maior que 1 de caracteres com quantidade impar
		ou o tamanho for de 2 e serem diferentes entre si a String NÃO é palindroma e retornará false.
		*/
		if (b>1 || (a.length == 2 && b == 1)){
			return false;
		}
		//a String é palindroma e vai retornar true.
		else{
			return true;
		}
		
		
  }
}