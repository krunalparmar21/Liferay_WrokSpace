create index IX_3CE73647 on Demo_StudentDemo (city[$COLUMN_LENGTH:75$]);
create index IX_269A2FA3 on Demo_StudentDemo (firstName[$COLUMN_LENGTH:75$]);
create index IX_F10E459C on Demo_StudentDemo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F563831E on Demo_StudentDemo (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_CFFD06FF on FOO_Foo (field2);
create index IX_B2FCA947 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_905CD589 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], groupId);