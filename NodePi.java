
import java.util.Arrays;

public class NodePi implements Comparable<NodePi> {

    int[][] estado = new int[3][3];
    NodePi pai;
    char jogada;
    int profundidade;
    int custo;
    int pos_branca;

    NodePi() {
		this.pai = null;
		this.jogada = 'n';
		this.profundidade = 0;
		this.custo = 0;
		this.pos_branca = 4;
    }

    NodePi(int[][] state, NodePi parent, char operator, int depth, int pos, int cost) {
		this.pai = parent;
		this.jogada = operator;
		this.profundidade = depth;
		this.custo = cost;
		this.pos_branca = pos;
		this.estado = state;
    }

    @Override
    public int compareTo(NodePi no) {
        if (this.custo == no.custo) {
            return 0;
        } else if (this.custo > no.custo) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(10);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buf.append(this.estado[i][j]);
            }
        }
        buf.append(this.profundidade);

        return buf.toString();
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object no) {
        NodePi no2 = (NodePi) no;
        return Arrays.deepEquals(no2.estado, this.estado) && no2.profundidade == this.profundidade;
    }
}
