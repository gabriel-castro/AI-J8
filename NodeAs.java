
import java.util.Arrays;

public class NodeAs implements Comparable<NodeAs> {

    int[][] estado = new int[3][3];
    NodeAs pai;
    char jogada;
    int profundidade;
    int custo;
    int pos_branca;

    NodeAs() {
        pai = null;
        jogada = 'n';
        profundidade = 0;
        custo = 0;
        pos_branca = 4;
    }

    NodeAs(int[][] state, NodeAs parent, char operator, int depth, int pos, int cost) {
        pai = parent;
        jogada = operator;
        profundidade = depth;
        custo = cost;
        pos_branca = pos;
        estado = state;
    }

    @Override
    public int compareTo(NodeAs no) {
        if (custo  == no.custo ) {
            return 0;
        } else if (custo  > no.custo ) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer(10);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buf.append(estado[i][j]);
            }
        }
        return buf.toString();
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public boolean equals(Object no) {
        NodeAs no2 = (NodeAs) no;
        return Arrays.deepEquals(no2.estado, estado);
    }
}
