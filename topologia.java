import org.locationtech.jts.geom.*;
import org.locationtech.jts.operation.buffer.BufferOp;
import org.locationtech.jts.algorithm.distance.DistanceToPoint;

// Classe principal
public class TopologyAnalysis {

    public static void main(String[] args) {
        // Criar uma fábrica de geometrias
        GeometryFactory geometryFactory = new GeometryFactory();

        // Criar geometria de ponto
        Point point = geometryFactory.createPoint(new Coordinate(5, 5));

        // Criar geometria de linha
        LineString line = geometryFactory.createLineString(new Coordinate[]{
                new Coordinate(0, 0),
                new Coordinate(10, 10),
                new Coordinate(20, 5)
        });

        // Criar geometria de polígono
        Polygon polygon = geometryFactory.createPolygon(new Coordinate[]{
                new Coordinate(0, 0),
                new Coordinate(10, 0),
                new Coordinate(10, 10),
                new Coordinate(0, 10),
                new Coordinate(0, 0)
        });

        // Exibir informações iniciais
        System.out.println("Geometrias Criadas:");
        System.out.println("Ponto: " + point);
        System.out.println("Linha: " + line);
        System.out.println("Polígono: " + polygon);

        // Verificar se o ponto está dentro do polígono
        boolean isPointInsidePolygon = polygon.contains(point);
        System.out.println("\nO ponto está dentro do polígono? " + isPointInsidePolygon);

        // Verificar se a linha intersecta o polígono
        boolean doesLineIntersectPolygon = line.intersects(polygon);
        System.out.println("A linha intersecta o polígono? " + doesLineIntersectPolygon);

        // Calcular buffer em torno do ponto
        Geometry pointBuffer = point.buffer(2.0);
        System.out.println("\nBuffer ao redor do ponto (raio 2.0): " + pointBuffer);

        // Calcular a distância entre o ponto e a linha
        double distancePointToLine = line.distance(point);
        System.out.println("Distância do ponto à linha: " + distancePointToLine);

        // União da linha com o polígono
        Geometry unionLinePolygon = line.union(polygon);
        System.out.println("\nUnião da linha com o polígono: " + unionLinePolygon);

        // Diferença do polígono e o buffer do ponto
        Geometry differencePolygonBuffer = polygon.difference(pointBuffer);
        System.out.println("Diferença entre o polígono e o buffer do ponto: " + differencePolygonBuffer);

        // Outras análises topológicas
        boolean isLineWithinPolygon = polygon.contains(line);
        System.out.println("\nA linha está contida no polígono? " + isLineWithinPolygon);

        boolean doesPolygonTouchLine = polygon.touches(line);
        System.out.println("O polígono toca a linha? " + doesPolygonTouchLine);
    }
}
