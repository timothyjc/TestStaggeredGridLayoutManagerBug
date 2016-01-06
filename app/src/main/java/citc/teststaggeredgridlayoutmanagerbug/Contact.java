package citc.teststaggeredgridlayoutmanagerbug;

import android.database.Cursor;
import android.provider.ContactsContract;

public class Contact {

    private long mId;
    private String mLookupKey;
    private String mPhotoUriString;
    private String mName;

    public static Contact fromCursor(Cursor c) {

        int idIndex = c.getColumnIndex(ContactsContract.Contacts._ID);
        int lookupKeyIndex = c.getColumnIndex(ContactsContract.Contacts.LOOKUP_KEY);
        int photoUriIndex = c.getColumnIndex(ContactsContract.Contacts.PHOTO_URI);
        int nameIndex = c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME);

        long id = c.getLong(idIndex);
        String lookupKey = c.getString(lookupKeyIndex);
        String photoUriString = c.getString(photoUriIndex);
        String name = c.getString(nameIndex);

        Contact contact = new Contact();
        contact.setId(id);
        contact.setLookupKey(lookupKey);
        contact.setPhotoUriString(photoUriString);
        contact.setName(name);
        return contact;

    }

    public long getId() {
        return mId;
    }

    public void setId(long mId) {
        this.mId = mId;
    }

    public String getLookupKey() {
        return mLookupKey;
    }

    public void setLookupKey(String mLookupKey) {
        this.mLookupKey = mLookupKey;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getPhotoUriString() {
        return mPhotoUriString;
    }

    public void setPhotoUriString(String mPhotoUriString) {
        this.mPhotoUriString = mPhotoUriString;
    }

}
