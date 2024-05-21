package ProjetosTreinos;

public class HeapSort {
    public void sort(int arr[]) {
        int n = arr.length;

        // Construir heap (reorganizar array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Um por um extrair um elemento do heap
        for (int i=n-1; i>=0; i--) {
            // Mover o atual root para o fim
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // chamar max heapify no heap reduzido
            heapify(arr, i, 0);
        }
    }

    // Para heapify um subárvore enraizada com nó i que é
    // um índice em arr[]. n é o tamanho do heap
    void heapify(int arr[], int n, int i) {
        int largest = i;  // Inicializar o maior como root
        int l = 2*i + 1;  // esquerda = 2*i + 1
        int r = 2*i + 2;  // direita = 2*i + 2

        // Se o filho esquerdo é maior que a raiz
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Se o filho direito é maior que o maior até agora
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Se o maior não é a raiz
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursivamente heapify a subárvore afetada
            heapify(arr, n, largest);
        }
    }
}
