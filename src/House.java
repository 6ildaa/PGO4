import java.util.ArrayList;
import java.util.List;

class House {
    private static int roomCount;
    private List<Room> roomList;

    public House() {
        this.roomList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        roomList.add(room);
        roomCount++;
    }

    public void addRooms(List<Room> rooms) {
        roomList.addAll(rooms);
        roomCount += rooms.size();
    }

    public int getRoomCount() {
        return roomCount;
    }

}
