create index IX_E175453F on DemoEmployee_emp (city[$COLUMN_LENGTH:75$]);
create index IX_B5D6BBAB on DemoEmployee_emp (firstName[$COLUMN_LENGTH:75$]);
create index IX_69E5A094 on DemoEmployee_emp (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_7FC53C16 on DemoEmployee_emp (uuid_[$COLUMN_LENGTH:75$], groupId);