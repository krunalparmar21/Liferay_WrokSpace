create index IX_C59A7E69 on GBI_Entry (groupId, guestbookId);
create index IX_83A015B on GBI_Entry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3B79229D on GBI_Entry (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_B1B36934 on GBI_Guestbook (groupId);
create index IX_635608AA on GBI_Guestbook (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F93CB1AC on GBI_Guestbook (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_F5591FB6 on GB_Entry (groupId, guestbookId);
create index IX_B5EF5128 on GB_Entry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C1EA01AA on GB_Entry (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_9294AD47 on GB_Guestbook (groupId);
create index IX_9314A9F7 on GB_Guestbook (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_EDD4239 on GB_Guestbook (uuid_[$COLUMN_LENGTH:75$], groupId);