package mayenSergio;

import java.util.List;
import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private GeneradorDocumentos generadorDocumentos = new GeneradorDocumentos();
    private GeneradorAutores generadorAutores = new GeneradorAutores();

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Gestionar Documentos");
            System.out.println("2. Gestionar Autores");
            System.out.println("3. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    gestionarDocumentos();
                    break;
                case 2:
                    gestionarAutores();
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.\n");
            }
        } while (opcion != 3);
    }

    private void gestionarDocumentos() {
        int opcion;
        List<Documento> documentos = null;

        do {
            System.out.println("=== Gestionar Documentos ===");
            System.out.println("1. Crear documento");
            System.out.println("2. Mostrar lista de documentos");
            System.out.println("3. Editar documento");
            System.out.println("4. Eliminar documento");
            System.out.println("5. Buscar documento");
            System.out.println("6. Volver al menú principal");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (documentos == null) {
                        documentos = generadorDocumentos.crearNuevoDocumento();
                    } else {
                        documentos.addAll(generadorDocumentos.crearNuevoDocumento());
                        System.out.println("Nuevos documentos creados.\n");
                    }
                    break;
                case 2:
                if (documentos != null) {
                    System.out.println("\nLista de documentos:");
                    for (Documento documento : documentos) {
                        System.out.println(documento);
                    }
                    System.out.println();
                } else {
                    System.out.println("No hay documentos para mostrar. Crea uno primero.\n");
                }
                    break;
                case 3:
                    if (documentos != null) {
                        generadorDocumentos.editarDocumento(documentos);
                    } else {
                        System.out.println("No hay documentos para editar. Crea uno primero.\n");
                    }
                    break;
                case 4:
                    if (documentos != null) {
                        generadorDocumentos.eliminarDocumento(documentos);
                    } else {
                        System.out.println("No hay documentos para eliminar. Crea uno primero.\n");
                    }
                    break;
                case 5:
                    if (documentos != null) {
                        generadorDocumentos.buscarDocumento(documentos);
                    } else {
                        System.out.println("No hay documentos para buscar. Crea uno primero.\n");
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.\n");
            }
        } while (opcion != 6);
    }

    private void gestionarAutores() {
        int opcion;
        List<Autor> autor = null;

        do {
            System.out.println("=== Gestionar Autores ===");
            System.out.println("1. Crear autor");
            System.out.println("2. Mostrar lista de autores");
            System.out.println("3. Editar autor");
            System.out.println("4. Eliminar autor");
            System.out.println("5. Buscar autor");
            System.out.println("6. Volver al menú principal");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (autor == null) {
                        autor = generadorAutores.crearNuevoAutor();
                    } else {
                        autor.addAll(generadorAutores.crearNuevoAutor());
                        System.out.println("Nuevos autores creados.\n");
                    }
                    break;
                case 2:
                    if (autor != null) {
                        System.out.println("\nLista de autores:");
                        for (Autor autores : autor) {
                            System.out.println(autores);
                        }
                        System.out.println();
                    } else {
                        System.out.println("No hay autores para mostrar. Crea uno primero.\n");
                    }
                    break;
                case 3:
                    if (autor != null) {
                        generadorAutores.editarAutor(autor);
                    } else {
                        System.out.println("No hay autores para editar. Crea uno primero.\n");
                    }
                    break;
                case 4:
                    if (autor != null) {
                        generadorAutores.eliminarAutor(autor);
                    } else {
                        System.out.println("No hay autores para eliminar. Crea uno primero.\n");
                    }
                    break;
                case 5:
                    if (autor != null) {
                        generadorAutores.buscarAutor(autor);
                    } else {
                        System.out.println("No hay autores para buscar. Crea uno primero.\n");
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.\n");
            }
        } while (opcion != 6);
    }
}
