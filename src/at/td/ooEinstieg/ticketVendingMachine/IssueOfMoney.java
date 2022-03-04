package at.td.ooEinstieg.ticketVendingMachine;

public class IssueOfMoney {
    private double change;

    public int loadRecord(String recordTitle) {
        int recordListSize = this.records.size();
        int foundRecordPosition = 0;
        for (int i = 0; i < recordListSize ; i++) {

            if (recordTitle == this.records.get(i).getName()) {
                foundRecordPosition = i;
            }
        }
        return foundRecordPosition;
    }
}
