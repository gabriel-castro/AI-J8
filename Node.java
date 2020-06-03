
import java.util.Arrays;

public class Node implements Comparable<Node> {

    int[][] estado = new int[3][3];
    Node pai;
    char jogada;
    int profundidade;
    int custo;
    int pos_branca;

    Node() {
        this.pai = null;
        this.jogada = 'n';
        this.profundidade = 0;
        this.custo = 0;
        this.pos_branca = 4;
    }

    Node(int[][] state, Node parent, char operator, int depth, int pos, int cost) {
        this.pai = parent;
        this.jogada = operator;
        this.profundidade = depth;
        this.custo = cost;
        this.pos_branca = pos;
        this.estado = state;
    }

    @Override
    public int compareTo(Node no) {
        if (this.custo == no.custo) {
            return 0;
        } else if (this.custo > no.custo) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer(10);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buf.append(this.estado[i][j]);
            }
        }
        return buf.toString();
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object no) {
        Node no2 = (Node) no;
        return Arrays.deepEquals(no2.estado, this.estado);
    }
}
