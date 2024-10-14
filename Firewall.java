public class Firewall {
    public static void main(String[] args) {
        TrainerGroup trainerGroup = new TrainerGroup();
        trainerGroup.addTrainer("trainer1");
        trainerGroup.allowIP("192.168.1.100");

        String trainerId = "trainer1";
        String ip = "192.168.1.100";

        if (trainerGroup.canDownloadVideo(trainerId, ip)) {
            System.out.println("Download de vídeo permitido.");
        } else {
            System.out.println("Download de vídeo negado.");
        }
    }
}
