import java.util.*;

public class J8G {

	private static int cont;
	private static final PriorityQueue<Node> fila = new PriorityQueue<>();
	private static final HashSet<Node> visitados = new HashSet<>();

	public static Node procura(int[][] solucao, Node no) {
		fila.add(no);
		while (!fila.isEmpty()) {
			Node novo_no = fila.remove();
			if (Arrays.deepEquals(novo_no.estado, solucao)) {
				return novo_no;
			}
			expandir(novo_no, solucao);
		}
		return null;
	}

	public static void expandir(Node no, int[][] solucao) {
		Node no1 = new Node();
		no1.profundidade = no.profundidade + 1;
		copiaMATRIX(no1.estado, no.estado);
		no1.pai = no;
		if (no.pos_branca == 0 && no.jogada == 'c') {
			no1.estado[0][0] = no1.estado[0][1];
			no1.estado[0][1] = -1;
			no1.jogada = 'd';
			no1.pos_branca = 1;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
		} else if (no.pos_branca == 0 && no.jogada == 'e') {
			no1.estado[0][0] = no1.estado[1][0];
			no1.estado[1][0] = -1;
			no1.jogada = 'b';
			no1.pos_branca = 3;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
		} else if (no.pos_branca == 0 && no.jogada == 'n') {
			no1.estado[0][0] = no1.estado[0][1];
			no1.estado[0][1] = -1;
			no1.jogada = 'd';
			no1.pos_branca = 1;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[0][0] = no2.estado[1][0];
			no2.estado[1][0] = -1;
			no2.jogada = 'b';
			no2.pos_branca = 3;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 1 && no.jogada == 'd') {
			no1.estado[0][1] = no1.estado[0][2];
			no1.estado[0][2] = -1;
			no1.jogada = 'd';
			no1.pos_branca = 2;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[0][1] = no2.estado[1][1];
			no2.estado[1][1] = -1;
			no2.jogada = 'b';
			no2.pos_branca = 4;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 1 && no.jogada == 'e') {
			no1.estado[0][1] = no1.estado[0][0];
			no1.estado[0][0] = -1;
			no1.jogada = 'e';
			no1.pos_branca = 0;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[0][1] = no2.estado[1][1];
			no2.estado[1][1] = -1;
			no2.jogada = 'b';
			no2.pos_branca = 4;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 1 && no.jogada == 'c') {
			no1.estado[0][1] = no1.estado[0][0];
			no1.estado[0][0] = -1;
			no1.jogada = 'e';
			no1.pos_branca = 0;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[0][1] = no2.estado[0][2];
			no2.estado[0][2] = -1;
			no2.jogada = 'd';
			no2.pos_branca = 2;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 1 && no.jogada == 'n') {
			no1.estado[0][1] = no1.estado[0][2];
			no1.estado[0][2] = -1;
			no1.jogada = 'd';
			no1.pos_branca = 2;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[0][1] = no2.estado[0][0];
			no2.estado[0][0] = -1;
			no2.jogada = 'e';
			no2.pos_branca = 0;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
			Node no3 = new Node();
			copiaMATRIX(no3.estado, no.estado);
			no3.profundidade = no.profundidade + 1;
			no3.pai = no;
			no3.estado[0][1] = no3.estado[1][1];
			no3.estado[1][1] = -1;
			no3.jogada = 'b';
			no3.pos_branca = 4;
			no3.custo = calcCUSTO(no3.estado, solucao);
			if (!visitados.contains(no3)) {
				fila.add(no3);
				cont++;
				visitados.add(no3);
			}
		} else if (no.pos_branca == 2 && no.jogada == 'd') {
			no1.estado[0][2] = no1.estado[1][2];
			no1.estado[1][2] = -1;
			no1.jogada = 'b';
			no1.pos_branca = 5;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
		} else if (no.pos_branca == 2 && no.jogada == 'c') {
			no1.estado[0][2] = no1.estado[0][1];
			no1.estado[0][1] = -1;
			no1.jogada = 'e';
			no1.pos_branca = 1;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
		} else if (no.pos_branca == 2 && no.jogada == 'n') {
			no1.estado[0][2] = no1.estado[1][2];
			no1.estado[1][2] = -1;
			no1.jogada = 'b';
			no1.pos_branca = 5;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[0][2] = no2.estado[0][1];
			no2.estado[0][1] = -1;
			no2.jogada = 'e';
			no2.pos_branca = 1;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 3 && no.jogada == 'c') {
			no1.estado[1][0] = no1.estado[0][0];
			no1.estado[0][0] = -1;
			no1.jogada = 'c';
			no1.pos_branca = 0;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[1][0] = no2.estado[1][1];
			no2.estado[1][1] = -1;
			no2.jogada = 'd';
			no2.pos_branca = 4;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 3 && no.jogada == 'e') {
			no1.estado[1][0] = no1.estado[0][0];
			no1.estado[0][0] = -1;
			no1.jogada = 'c';
			no1.pos_branca = 0;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[1][0] = no2.estado[2][0];
			no2.estado[2][0] = -1;
			no2.jogada = 'b';
			no2.pos_branca = 6;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 3 && no.jogada == 'b') {
			no1.estado[1][0] = no1.estado[1][1];
			no1.estado[1][1] = -1;
			no1.jogada = 'd';
			no1.pos_branca = 4;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[1][0] = no2.estado[2][0];
			no2.estado[2][0] = -1;
			no2.jogada = 'b';
			no2.pos_branca = 6;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 3 && no.jogada == 'n') {
			no1.estado[1][0] = no1.estado[0][0];
			no1.estado[0][0] = -1;
			no1.jogada = 'c';
			no1.pos_branca = 0;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[1][0] = no2.estado[1][1];
			no2.estado[1][1] = -1;
			no2.jogada = 'd';
			no2.pos_branca = 4;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
			Node no3 = new Node();
			copiaMATRIX(no3.estado, no.estado);
			no3.profundidade = no.profundidade + 1;
			no3.pai = no;
			no3.estado[1][0] = no3.estado[2][0];
			no3.estado[2][0] = -1;
			no3.jogada = 'b';
			no3.pos_branca = 6;
			no3.custo = calcCUSTO(no3.estado, solucao);
			if (!visitados.contains(no3)) {
				fila.add(no3);
				cont++;
				visitados.add(no3);
			}
		} else if (no.pos_branca == 4 && no.jogada == 'e') {
			no1.estado[1][1] = no1.estado[0][1];
			no1.estado[0][1] = -1;
			no1.jogada = 'c';
			no1.pos_branca = 1;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[1][1] = no2.estado[1][0];
			no2.estado[1][0] = -1;
			no2.jogada = 'e';
			no2.pos_branca = 3;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
			Node no3 = new Node();
			copiaMATRIX(no3.estado, no.estado);
			no3.profundidade = no.profundidade + 1;
			no3.pai = no;
			no3.estado[1][1] = no3.estado[2][1];
			no3.estado[2][1] = -1;
			no3.jogada = 'b';
			no3.pos_branca = 7;
			no3.custo = calcCUSTO(no3.estado, solucao);
			if (!visitados.contains(no3)) {
				fila.add(no3);
				cont++;
				visitados.add(no3);
			}
		} else if (no.pos_branca == 4 && no.jogada == 'd') {
			no1.estado[1][1] = no1.estado[0][1];
			no1.estado[0][1] = -1;
			no1.jogada = 'c';
			no1.pos_branca = 1;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[1][1] = no2.estado[1][2];
			no2.estado[1][2] = -1;
			no2.jogada = 'd';
			no2.pos_branca = 5;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
			Node no3 = new Node();
			copiaMATRIX(no3.estado, no.estado);
			no3.profundidade = no.profundidade + 1;
			no3.pai = no;
			no3.estado[1][1] = no3.estado[2][1];
			no3.estado[2][1] = -1;
			no3.jogada = 'b';
			no3.pos_branca = 7;
			no3.custo = calcCUSTO(no3.estado, solucao);
			if (!visitados.contains(no3)) {
				fila.add(no3);
				cont++;
				visitados.add(no3);
			}
		} else if (no.pos_branca == 4 && no.jogada == 'c') {
			no1.estado[1][1] = no1.estado[0][1];
			no1.estado[0][1] = -1;
			no1.jogada = 'c';
			no1.pos_branca = 1;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[1][1] = no2.estado[1][0];
			no2.estado[1][0] = -1;
			no2.jogada = 'e';
			no2.pos_branca = 3;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
			Node no3 = new Node();
			copiaMATRIX(no3.estado, no.estado);
			no3.profundidade = no.profundidade + 1;
			no3.pai = no;
			no3.estado[1][1] = no3.estado[1][2];
			no3.estado[1][2] = -1;
			no3.jogada = 'd';
			no3.pos_branca = 5;
			no3.custo = calcCUSTO(no3.estado, solucao);
			if (!visitados.contains(no3)) {
				fila.add(no3);
				cont++;
				visitados.add(no3);
			}
		} else if (no.pos_branca == 4 && no.jogada == 'b') {
			no1.estado[1][1] = no1.estado[1][2];
			no1.estado[1][2] = -1;
			no1.jogada = 'd';
			no1.pos_branca = 3;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[1][1] = no2.estado[1][0];
			no2.estado[1][0] = -1;
			no2.jogada = 'e';
			no2.pos_branca = 5;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
			Node no3 = new Node();
			copiaMATRIX(no3.estado, no.estado);
			no3.profundidade = no.profundidade + 1;
			no3.pai = no;
			no3.estado[1][1] = no3.estado[2][1];
			no3.estado[2][1] = -1;
			no3.jogada = 'b';
			no3.pos_branca = 7;
			no3.custo = calcCUSTO(no3.estado, solucao);
			if (!visitados.contains(no3)) {
				fila.add(no3);
				cont++;
				visitados.add(no3);
			}
		} else if (no.pos_branca == 4 && no.jogada == 'n') {
			no1.estado[1][1] = no1.estado[0][1];
			no1.estado[0][1] = -1;
			no1.jogada = 'c';
			no1.pos_branca = 1;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[1][1] = no2.estado[1][0];
			no2.estado[1][0] = -1;
			no2.jogada = 'e';
			no2.pos_branca = 3;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
			Node no3 = new Node();
			copiaMATRIX(no3.estado, no.estado);
			no3.profundidade = no.profundidade + 1;
			no3.pai = no;
			no3.estado[1][1] = no3.estado[2][1];
			no3.estado[2][1] = -1;
			no3.jogada = 'b';
			no3.pos_branca = 7;
			no3.custo = calcCUSTO(no3.estado, solucao);
			if (!visitados.contains(no3)) {
				fila.add(no3);
				cont++;
				visitados.add(no3);
			}
			Node no4 = new Node();
			no4.profundidade = no.profundidade + 1;
			copiaMATRIX(no4.estado, no.estado);
			no4.pai = no;
			no4.estado[1][1] = no4.estado[1][2];
			no4.estado[1][2] = -1;
			no4.jogada = 'd';
			no4.pos_branca = 5;
			no4.custo = calcCUSTO(no4.estado, solucao);
			if (!visitados.contains(no4)) {
				fila.add(no4);
				cont++;
				visitados.add(no4);
			}
		} else if (no.pos_branca == 5 && no.jogada == 'c') {
			no1.estado[1][2] = no1.estado[1][1];
			no1.estado[1][1] = -1;
			no1.jogada = 'e';
			no1.pos_branca = 4;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[1][2] = no2.estado[0][2];
			no2.estado[0][2] = -1;
			no2.jogada = 'c';
			no2.pos_branca = 2;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 5 && no.jogada == 'b') {
			no1.estado[1][2] = no1.estado[1][1];
			no1.estado[1][1] = -1;
			no1.jogada = 'e';
			no1.pos_branca = 4;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[1][2] = no2.estado[2][2];
			no2.estado[2][2] = -1;
			no2.jogada = 'b';
			no2.pos_branca = 8;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 5 && no.jogada == 'd') {
			no1.estado[1][2] = no1.estado[2][2];
			no1.estado[2][2] = -1;
			no1.jogada = 'b';
			no1.pos_branca = 8;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[1][2] = no2.estado[0][2];
			no2.estado[0][2] = -1;
			no2.jogada = 'c';
			no2.pos_branca = 2;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 5 && no.jogada == 'n') {
			no1.estado[1][1] = no1.estado[0][1];
			no1.estado[0][1] = -1;
			no1.jogada = 'c';
			no1.pos_branca = 1;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[1][2] = no2.estado[1][1];
			no2.estado[1][1] = -1;
			no2.jogada = 'e';
			no2.pos_branca = 4;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
			Node no3 = new Node();
			copiaMATRIX(no3.estado, no.estado);
			no3.profundidade = no.profundidade + 1;
			no3.pai = no;
			no3.estado[1][2] = no3.estado[2][2];
			no3.estado[2][2] = -1;
			no3.jogada = 'b';
			no3.pos_branca = 8;
			no3.custo = calcCUSTO(no3.estado, solucao);
			if (!visitados.contains(no3)) {
				fila.add(no3);
				cont++;
				visitados.add(no3);
			}
		} else if (no.pos_branca == 6 && no.jogada == 'b') {
			no1.estado[2][0] = no1.estado[2][1];
			no1.estado[2][1] = -1;
			no1.jogada = 'd';
			no1.pos_branca = 7;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
		} else if (no.pos_branca == 6 && no.jogada == 'e') {
			no1.estado[2][0] = no1.estado[1][0];
			no1.estado[1][0] = -1;
			no1.jogada = 'c';
			no1.pos_branca = 3;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
		} else if (no.pos_branca == 6 && no.jogada == 'n') {
			no1.estado[2][0] = no1.estado[1][0];
			no1.estado[1][0] = -1;
			no1.jogada = 'c';
			no1.pos_branca = 3;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[2][0] = no2.estado[2][1];
			no2.estado[2][1] = -1;
			no2.jogada = 'd';
			no2.pos_branca = 7;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 7 && no.jogada == 'n') {
			no1.estado[2][1] = no1.estado[1][1];
			no1.estado[1][1] = -1;
			no1.jogada = 'c';
			no1.pos_branca = 4;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[2][1] = no2.estado[2][0];
			no2.estado[2][0] = -1;
			no2.jogada = 'e';
			no2.pos_branca = 6;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
			Node no3 = new Node();
			copiaMATRIX(no3.estado, no.estado);
			no3.profundidade = no.profundidade + 1;
			no3.pai = no;
			no3.estado[2][1] = no3.estado[2][2];
			no3.estado[2][2] = -1;
			no3.jogada = 'd';
			no3.pos_branca = 8;
			no3.custo = calcCUSTO(no3.estado, solucao);
			if (!visitados.contains(no3)) {
				fila.add(no3);
				cont++;
				visitados.add(no3);
			}
		} else if (no.pos_branca == 7 && no.jogada == 'e') {
			no1.estado[2][1] = no1.estado[2][0];
			no1.estado[2][0] = -1;
			no1.jogada = 'e';
			no1.pos_branca = 6;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[2][1] = no2.estado[1][1];
			no2.estado[1][1] = -1;
			no2.jogada = 'c';
			no2.pos_branca = 4;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 7 && no.jogada == 'd') {
			no1.estado[2][1] = no1.estado[2][2];
			no1.estado[2][2] = -1;
			no1.jogada = 'd';
			no1.pos_branca = 8;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[2][1] = no2.estado[1][1];
			no2.estado[1][1] = -1;
			no2.jogada = 'c';
			no2.pos_branca = 4;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 7 && no.jogada == 'b') {
			no1.estado[2][1] = no1.estado[2][0];
			no1.estado[2][0] = -1;
			no1.jogada = 'e';
			no1.pos_branca = 6;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[2][1] = no2.estado[2][2];
			no2.estado[2][2] = -1;
			no2.jogada = 'd';
			no2.pos_branca = 8;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		} else if (no.pos_branca == 8 && no.jogada == 'b') {
			no1.estado[2][2] = no1.estado[2][1];
			no1.estado[2][1] = -1;
			no1.jogada = 'e';
			no1.pos_branca = 7;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
		} else if (no.pos_branca == 8 && no.jogada == 'd') {
			no1.estado[2][2] = no1.estado[1][2];
			no1.estado[1][2] = -1;
			no1.jogada = 'c';
			no1.pos_branca = 5;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
		} else if (no.pos_branca == 8 && no.jogada == 'n') {
			no1.estado[2][2] = no1.estado[1][2];
			no1.estado[0][1] = -1;
			no1.jogada = 'c';
			no1.pos_branca = 5;
			no1.custo = calcCUSTO(no1.estado, solucao);
			if (!visitados.contains(no1)) {
				fila.add(no1);
				cont++;
				visitados.add(no1);
			}
			Node no2 = new Node();
			no2.profundidade = no.profundidade + 1;
			copiaMATRIX(no2.estado, no.estado);
			no2.pai = no;
			no2.estado[2][2] = no2.estado[2][1];
			no2.estado[2][1] = -1;
			no2.jogada = 'e';
			no2.pos_branca = 7;
			no2.custo = calcCUSTO(no2.estado, solucao);
			if (!visitados.contains(no2)) {
				fila.add(no2);
				cont++;
				visitados.add(no2);
			}
		}
	}

	public static void imprimeMATRIX(int[][] matrix) {
		System.out.print("\n");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public static void copiaMATRIX(int[][] ma, int[][] mb) {
		for (int i = 0; i < 3; i++) {
			System.arraycopy(mb[i], 0, ma[i], 0, 3);
		}
	}

	public static void caminho(Node no) {
		imprimeMATRIX(no.estado);
		System.out.print("profundidade:" + no.profundidade + '\n');
		System.out.print("jogada:" + no.jogada + '\n');
		if (no.pai != null) {
			caminho(no.pai);
		}
	}

	public static int calcCUSTO(int[][] ma, int[][] mb) {
		int custo = 0;
		int x1, x2, y1, y2;
		for (int i = 1; i <= 8; i++) {
			x1 = indexOFFX(i, ma);
			x2 = indexOFFX(i, mb);
			y1 = indexOFFY(i, ma);
			y2 = indexOFFY(i, mb);
			custo += Math.abs(x1 - x2) + Math.abs(y1 - y2);
		}
		return custo;
	}

	public static int indexOFFX(int a, int[][] ma) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (ma[i][j] == a) {
					return i;
				}
			}
		}
		return -1;
	}

	public static int indexOFFY(int a, int[][] ma) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (ma[i][j] == a) {
					return j;
				}
			}
		}
		return -1;
	}

	public static int[][] fazMATRIX(Scanner in) {
		int[][] ma = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				ma[i][j] = in.nextInt();
			}
		}
		return ma;
	}

	public static int posBRANCO(int[][] ma) {
		int pos = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (ma[i][j] == -1) {
					return pos;
				}
				pos++;
			}
		}
		return 0;
	}

	public static boolean hasSolution(int[][] initialTable,int[][] finalTable){
		int initialTableParity = 0;
		int finalTableParity = 0;
		for (int row=0 ; row<3; row++) {
			for (int col=0 ; col<3; col++) {
				int value = initialTable[row][col];
				for (int i=row ; i<3; i++) {
					for (int j=0 ; j<3; j++) {
						int nextValue = initialTable[i][j];
						if( (nextValue < value) && (nextValue != -1) && ( j>col || i > row )) {
							initialTableParity+=1;
						}
					}
				}
			}
		}
		for (int row=0 ; row<3; row++) {
			for (int col=0 ; col<3; col++) {
				int value = finalTable[row][col];
				for (int i=row ; i<3; i++) {
					for (int j=0 ; j<3; j++) {
						int nextValue = finalTable[i][j];
						if ((nextValue < value) && (nextValue != -1) && ( j>col || i > row )) {
							finalTableParity+=1;
						}
					}
				}
			}
		}
		return ((initialTableParity%2) == (finalTableParity%2));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("insira os valores da matriz inicial separados por um espaco\n");
		System.out.print("(usar '-1' como peca branca)\n");
		System.out.print("exemplo 1 2 3 4 5 6 7 8 -1\n");
		int[][] estado_inicial = fazMATRIX(in);
		System.out.print("insira os valores da matriz final separados por um espaco\n");
		System.out.print("(usar '-1' como peca branca)\n");
		double start = new Date().getTime();
		int[][] solucao = fazMATRIX(in);
		if (!hasSolution(estado_inicial,solucao)){
			System.out.print("Não tem solucao\n");
			System.exit(0);
		}
		Node no = new Node(estado_inicial, null, 'n', 0, posBRANCO(estado_inicial), calcCUSTO(estado_inicial, solucao));
		Node no_final = procura(solucao, no);
		if (no_final != null) {
			double end = new Date().getTime();
			System.out.println("Tempo de execução: " + (end - start) / 1000 + "s (" + (end - start) + "ms)");
			double used_memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
			System.out.printf("Memória utilizada: %.3f MB (%.3f KB)\n", used_memory / (1024 * 1024),
				used_memory / 1024);
			System.out.println("Número de nós expandidos: " + cont);
			caminho(no_final);
		} 
		in.close();
	}
}
